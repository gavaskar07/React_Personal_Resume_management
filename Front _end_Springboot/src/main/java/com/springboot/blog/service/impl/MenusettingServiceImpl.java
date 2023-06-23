package com.springboot.blog.service.impl;
import lombok.AllArgsConstructor;
import com.springboot.blog.entity.Menusetting;
import com.springboot.blog.repository.MenusettingRespository;
import com.springboot.blog.service.MenusettingService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
@AllArgsConstructor
public class MenusettingServiceImpl implements MenusettingService {
    private MenusettingRespository menusettingRepository;
    @Override
    public Menusetting mcreate(Menusetting menusetting) {
        return menusettingRepository.save(menusetting);
    }

    @Override
    public Menusetting mretrivebyid(Long userId) {
        Optional<Menusetting> optionalemnusetting =menusettingRepository.findById(userId);
        return optionalemnusetting.get();
    }

    @Override
    public List<Menusetting> mretriveall() {
        return menusettingRepository.findAll();
    }

    @Override
    public Menusetting mupdate(Menusetting menusetting) {
        Menusetting existingmenusetting = menusettingRepository.findById(menusetting.getId()).get();
        existingmenusetting.setMenucode(menusetting.getMenucode());
        existingmenusetting.setMenuname(menusetting.getMenuname());
        Menusetting updatedmenusetting = menusettingRepository.save(existingmenusetting);
        return updatedmenusetting;
    }

    @Override
    public void mdelete(Long userId) {
        menusettingRepository.deleteById(userId);
    }
}
