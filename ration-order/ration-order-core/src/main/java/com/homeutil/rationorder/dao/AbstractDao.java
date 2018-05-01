package com.homeutil.rationorder.dao;

import java.util.ArrayList;
import java.util.List;

import org.bson.Document;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoOperations;

import com.mongodb.Block;
import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoCollection;

public abstract class AbstractDao<T> {
	
	@Autowired
	protected MongoOperations mongoOperations;
	
	protected MongoCollection<Document> mongoCollection;
	
	public  List<T> listAll(){
		List<T> typeList = new ArrayList<T>();
		FindIterable<Document> typeIterator=mongoCollection.find();
		typeIterator.forEach(new Block<Document>(){
			@Override
			public void apply(Document document) {
				T t = mapDocument(document);
				typeList.add(t);
			}			
		});
		
		return typeList;
	}
	
	protected abstract T mapDocument(Document document);
	

}
