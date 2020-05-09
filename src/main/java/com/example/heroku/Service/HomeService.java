package com.example.heroku.Service;

import com.example.heroku.DAO.HomeDAO;
import com.example.heroku.Entity.HomeEntity;
import com.example.heroku.Model.HomeDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Service
public class HomeService {

    @Autowired
    private HomeDAO homeDAO;

    @Transactional
    public List<HomeDTO> getHome(){
        List<HomeDTO> homeDTOList = new ArrayList<>();
        List<HomeEntity> homeEntityList = homeDAO.getHome();
        for(HomeEntity i: homeEntityList){
            HomeDTO homeDTO = new HomeDTO();
            homeDTO.setId(i.getId());
            homeDTO.setCity(i.getCity());
            homeDTO.setCommune(i.getCommune());
            homeDTO.setDistricts(i.getDistricts());
            homeDTO.setVillage(i.getVillage());
            homeDTOList.add(homeDTO);
        }
        return homeDTOList;
    }
}
