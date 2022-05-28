package com.example.WebService.Controller;

import com.example.WebService.Dto_Huyen.CauhoiDto;
import com.example.WebService.Entity_BLX.Cauhoi;
import com.example.WebService.DTO.CauhoiDTO;
import com.example.WebService.Services.Impl.CauhoiServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/cauhoi/")
public class CauhoiController {
    @Autowired
    private CauhoiServiceImpl cauhoiService;

    @GetMapping("get")
    public List<CauhoiDTO> getCauhoi() {
        List<CauhoiDTO> list = cauhoiService.getListCauhoi();
        return list;
    }

    @GetMapping("{id}")
    public CauhoiDTO getCauhoiById(@PathVariable Integer id){
        System.out.println("id: "+id);
        CauhoiDTO cauhoi = cauhoiService.getCauhoiById(id);
        return cauhoi;
    }

    @GetMapping("getCauhoiLT")
    public List<CauhoiDTO> getCauhoiLT(@RequestParam(name="mabode") Integer maBoDe, @RequestParam(name="maloailt") Integer maLoailt) {
        List<CauhoiDTO> list = cauhoiService.getCauHoiLT(maBoDe,maLoailt);
        return list;
    }

    @GetMapping("randDeThi")
    public List<CauhoiDTO> randDeThi(@RequestParam(name="mabode") Integer maBoDe) {
        List<CauhoiDTO> list = cauhoiService.randCauHoi(maBoDe);
        List<CauhoiDTO> deThi = new ArrayList<CauhoiDTO>();
        for(int i =0; i<10;i++){
            deThi.add(list.get(i));
        }
        return deThi;
    }

    @GetMapping("getkqch")
    public List<CauhoiDTO> getKQ_Cauhoi(@RequestParam(name="email") String email,@RequestParam(name="luotthi") Integer luotthi, @RequestParam(name="mabode") Integer mabode) {
        List<CauhoiDTO> list = cauhoiService.getKQ_Cauhoi(email,luotthi,mabode);
        return list;
    }

    @GetMapping("getcausai")
    public List<CauhoiDTO> getCausai(@RequestParam(name="email") String email,@RequestParam(name="mabode") Integer mabode) {
        List<CauhoiDTO> list = cauhoiService.getCausai(email,mabode);
        return list;
    }



    @GetMapping("get-all")
    public List<CauhoiDto> getCauhoiHuyen() {
        List<CauhoiDto> list = cauhoiService.findAll();
        return list;
    }
}
