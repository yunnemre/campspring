package com.yunnique.rentACar.business.abstracts;

import java.util.List;

import com.yunnique.rentACar.business.requests.CreateBrandRequest;
import com.yunnique.rentACar.business.responses.GetAllBrandsResponse;

public interface BrandService {
	List<GetAllBrandsResponse> getAll();
	void add(CreateBrandRequest createBrandRequest);
	
}
