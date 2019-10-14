package io.javabrains.truckinfoservice.resources;

import io.javabrains.truckinfoservice.models.Truck;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/trucks")
public class TruckResources {
    @RequestMapping("/{truckId}")
	public Truck getTruckInfo(@PathVariable("truckId") String truckId){
      return new Truck(truckId, "Test name");
	}

}
