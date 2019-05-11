package cj.studio.backend.uc.plugin.service;

import java.util.List;

import cj.studio.backend.uc.bo.Company;
import cj.studio.backend.uc.bo.CompanyAttribute;
import cj.studio.backend.uc.bo.CompanyAttributeExample;
import cj.studio.backend.uc.bo.CompanyExample;
import cj.studio.backend.uc.bo.CompanySegment;
import cj.studio.backend.uc.bo.CompanySegmentExample;
import cj.studio.backend.uc.bo.Segment;
import cj.studio.backend.uc.plugin.dao.CompanyAttributeMapper;
import cj.studio.backend.uc.plugin.dao.CompanyMapper;
import cj.studio.backend.uc.plugin.dao.CompanySegmentMapper;
import cj.studio.backend.uc.service.ICompanyService;
import cj.studio.ecm.EcmException;
import cj.studio.ecm.annotation.CjService;
import cj.studio.ecm.annotation.CjServiceRef;
import cj.studio.orm.mybatis.annotation.CjTransaction;

@CjService(name = "companyService")
public class CompanyService implements ICompanyService {
	@CjServiceRef(refByName = "mybatis.cj.studio.backend.uc.plugin.dao.CompanyMapper")
	CompanyMapper companyMapper;
	@CjServiceRef(refByName = "mybatis.cj.studio.backend.uc.plugin.dao.CompanyAttributeMapper")
	CompanyAttributeMapper companyAttributeMapper;
	@CjServiceRef(refByName = "mybatis.cj.studio.backend.uc.plugin.dao.CompanySegmentMapper")
	CompanySegmentMapper companySegmentMapper;
	@CjTransaction
	@Override
	public void addCompany(String companyCode, String cnname, String enname) {
		Company company = getCompany(companyCode);
		if (company != null) {
			throw new EcmException("已存在公司：" + companyCode);
		}
		company = new Company();
		company.setCnname(cnname);
		company.setCode(companyCode);
		company.setCtime(System.currentTimeMillis());
		company.setEnname(enname);
		companyMapper.insert(company);
	}
	@CjTransaction
	@Override
	public void removeCompany(String companyCode) {
		CompanyExample example = new CompanyExample();
		example.createCriteria().andCodeEqualTo(companyCode);
		companyMapper.deleteByExample(example);
	}
	@CjTransaction
	@Override
	public Company getCompany(String companyCode) {
		CompanyExample example = new CompanyExample();
		example.createCriteria().andCodeEqualTo(companyCode);
		List<Company> list = this.companyMapper.selectByExample(example);
		if (list.isEmpty())
			return null;
		return list.get(0);
	}
	@CjTransaction
	@Override
	public List<Company> page(int currPage, int pageSize) {
		return companyMapper.page(currPage, pageSize);
	}
	@CjTransaction
	@Override
	public void addCompanyAttribute(String companyCode, String segCode, String attrCode, String value) {
		CompanyAttribute attr = new CompanyAttribute();
		attr.setAttrcode(attrCode);
		attr.setCompanycode(companyCode);
		attr.setSegcode(segCode);
		attr.setValue(value);
		this.companyAttributeMapper.insertSelective(attr);

	}
	@CjTransaction
	@Override
	public void removeCompanyAttribute(String companyCode, String segCode, String attrCode) {
		CompanyAttributeExample example = new CompanyAttributeExample();
		example.createCriteria().andCompanycodeEqualTo(companyCode).andSegcodeEqualTo(segCode)
				.andAttrcodeEqualTo(attrCode);
		this.companyAttributeMapper.deleteByExample(example);
	}
	@CjTransaction
	@Override
	public String getCompanyAttribute(String companyCode, String segCode, String attrCode) {
		CompanyAttributeExample example = new CompanyAttributeExample();
		example.createCriteria().andCompanycodeEqualTo(companyCode).andSegcodeEqualTo(segCode)
				.andAttrcodeEqualTo(attrCode);
		List<CompanyAttribute> list = this.companyAttributeMapper.selectByExample(example);
		if (list.isEmpty())
			return null;
		return list.get(0).getValue();
	}
	@CjTransaction
	@Override
	public void emptyCompanyAttributes(String companyCode, String segCode) {
		CompanyAttributeExample example = new CompanyAttributeExample();
		example.createCriteria().andCompanycodeEqualTo(companyCode).andSegcodeEqualTo(segCode);
		this.companyAttributeMapper.deleteByExample(example);
	}
	@CjTransaction
	@Override
	public List<CompanyAttribute> getCompanyAttributes(String companyCode, String segCode) {
		CompanyAttributeExample example = new CompanyAttributeExample();
		example.createCriteria().andCompanycodeEqualTo(companyCode).andSegcodeEqualTo(segCode);
		return this.companyAttributeMapper.selectByExample(example);
	}
	@CjTransaction
	@Override
	public List<Segment> getSegmentsOfCompany() {
		return this.companySegmentMapper.getSegments();
	}
	@CjTransaction
	@Override
	public void addSegmentOfCompany(String segCode, int sort) {
		CompanySegment seg=new CompanySegment();
		seg.setSegcode(segCode);
		seg.setSort(sort);
		this.companySegmentMapper.insert(seg);
	}
	@CjTransaction
	@Override
	public void removeSegmentOfCompany(String segCode) {
		CompanySegmentExample example=new CompanySegmentExample();
		example.createCriteria().andSegcodeEqualTo(segCode);
		this.companySegmentMapper.deleteByExample(example);
	}
	@CjTransaction
	@Override
	public void emptySegmentsOfCompany() {
		CompanySegmentExample example=new CompanySegmentExample();
		this.companySegmentMapper.deleteByExample(example);
	}

}
