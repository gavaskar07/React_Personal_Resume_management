
package com.springboot.pms.service;
import com.springboot.pms.entity.Menusetting;
import java.util.List;
public interface MenusettingService {
    Menusetting mcreate(Menusetting menusetting);
    Menusetting mretrivebyid(Long userId);
    List<Menusetting> mretriveall();
    Menusetting mupdate(Menusetting menusetting);
    void mdelete(Long userId);
}
