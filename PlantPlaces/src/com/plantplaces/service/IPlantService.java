package com.plantplaces.service;

import java.util.List;

import com.plantplaces.dto.Plant;

/**
 * IPlantService includes all business related functions for a Plant and related entities
 * @author Brandan Jones
 *
 */
public interface IPlantService {

	/**
	 * Return a collection of Plant objects that contain the given filter text.
	 * @param filter a substring that should be contained in returned plants.
	 * @return a collection of matching plants.
	 */
	public List<Plant> filterPlants(String filter);
	
}