package com.homeutil.rationorder.dao;
import static com.homeutil.rationorder.util.Constants.MONGO_COLLECTION_MEASUREMENT_ID;

import java.util.List;

import org.bson.Document;

import com.homeutil.rationorder.model.MeasuringCriteria;

public class MeasurementDao extends AbstractDao<MeasuringCriteria> {
	
	public MeasurementDao(){
		mongoCollection=mongoOperations.getCollection(MONGO_COLLECTION_MEASUREMENT_ID);
	}

	@SuppressWarnings("unchecked")
	@Override
	protected MeasuringCriteria mapDocument(Document document) {
		MeasuringCriteria measuringCriteria = new MeasuringCriteria();
		measuringCriteria.setKey(document.getString("key"));
		measuringCriteria.setUnits((List<String>)document.get("units"));
		
		return measuringCriteria;
	}

	

}
