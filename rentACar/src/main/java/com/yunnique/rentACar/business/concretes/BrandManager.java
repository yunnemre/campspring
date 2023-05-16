package com.yunnique.rentACar.business.concretes;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.yunnique.rentACar.business.abstracts.BrandService;
import com.yunnique.rentACar.business.requests.CreateBrandRequest;
import com.yunnique.rentACar.business.responses.GetAllBrandsResponse;
import com.yunnique.rentACar.dataAccess.abstracts.BrandRepository;
import com.yunnique.rentACar.entities.concretes.Brand;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class BrandManager implements BrandService{
	private BrandRepository brandRepository;
	
	@Override
	public List<GetAllBrandsResponse> getAll() {
		List<Brand> brands=brandRepository.findAll();
		List<GetAllBrandsResponse> brandsResponse=new ArrayList<GetAllBrandsResponse>();
		
		for (Brand brand:brands) {
			GetAllBrandsResponse responseItem=new GetAllBrandsResponse();
			responseItem.setId(brand.getId());
			responseItem.setName(brand.getName());
			brandsResponse.add(responseItem);
		}
		
		//iş kuralları
		return brandsResponse;
	}

	@Override
	public void add(CreateBrandRequest createBrandRequest) {
		
		Brand brand = new Brand();
		brand.setName(createBrandRequest.getName());
		this.brandRepository.save(brand);
		
	}

}
