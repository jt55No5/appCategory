package service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import service.DataDictionaryService;
import mapper.DataDictionaryMapper;

@Service("dataDictionaryService")
public class DataDictionaryServiceImpl implements DataDictionaryService{
	@Autowired
	private DataDictionaryMapper dataDictionaryMapper;

	public DataDictionaryMapper getDataDictionaryMapper() {
		return dataDictionaryMapper;
	}

	public void setDataDictionaryMapper(DataDictionaryMapper dataDictionaryMapper) {
		this.dataDictionaryMapper = dataDictionaryMapper;
	}
	
	
}
