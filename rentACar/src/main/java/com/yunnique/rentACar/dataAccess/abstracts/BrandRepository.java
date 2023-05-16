package com.yunnique.rentACar.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import com.yunnique.rentACar.entities.concretes.Brand;


public interface BrandRepository extends JpaRepository<Brand,Integer> {

}
