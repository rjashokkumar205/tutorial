package com.example.service;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.model.Router;
import com.example.repository.RouterRepository;

import io.micrometer.core.instrument.util.StringUtils;

@Service
public class RouterService {
  @Autowired
  private RouterRepository rdto;
  
  String line=""; 
  
  
  public void saveRouterData()  {
	   try {
		   BufferedReader br=new BufferedReader(new FileReader("src/main/resource/routerz.csv"));
		   line=br.readLine();
		while(!StringUtils.isEmpty(line))  {
			String[] data=line.split(",");
		   Router r=new Router();
		   r.setRPD(data[0]);
		   r.setMAC(data[1]);
		   r.setSegmentation(data[2]);
		   r.setServiceDefinition(data[3]);
		   r.setPrincipalCore(data[4]);
		   r.setPrincipalCoreInterface(data[5]);
		   r.setDSPort(data[6]);
		   r.setUSPort(data[7]);
		   r.setEnhancedControllerAlignment(data[8]);
		   r.setShelf(data[9]);
		   r.setDSDataServiceGroup(data[10]);
		   r.setUSDataServiceGroup(data[11]);
		   r.setDisableNetworkDelay(data[12]);
		   r.setLatitude(data[13]);
		   r.setLongitude(data[14]);
		   r.setStatus(data[15]);
		   r.setDescription(data[16]);
		   rdto.save(r);
		   
		}
		   
		} catch (IOException e) {
			//TODO Auto-generated catch block
			e.printStackTrace();
		}
	   
	  
	  
	  
	  
	  
  }
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
  }
  
  
  
  
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

