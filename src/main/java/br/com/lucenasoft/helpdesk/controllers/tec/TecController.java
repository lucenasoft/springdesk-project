package br.com.lucenasoft.helpdesk.controllers.tec;


import br.com.lucenasoft.helpdesk.Enums.ProfileEnum;
import br.com.lucenasoft.helpdesk.models.TecModel;
import br.com.lucenasoft.helpdesk.repositories.TecRepository;
import br.com.lucenasoft.helpdesk.utils.UploadImg;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("tec")
public class TecController {

    @Autowired
    private TecRepository repository;

    @GetMapping("/register")
    public ModelAndView register(TecModel tec) {
        ModelAndView mv = new ModelAndView("tec/register");
        mv.addObject("tec", tec);
        mv.addObject("profiles", ProfileEnum.values());
        return mv;
    }

    @PostMapping("/register")
    public ModelAndView register(@ModelAttribute TecModel tec, @RequestParam("file") MultipartFile img){
        ModelAndView mv = new ModelAndView("tec/register");
        mv.addObject("tec", tec);

        try {
            if(UploadImg.uploadImg(img)) {
                tec.setImgURL(img.getOriginalFilename());
            }
            repository.save(tec);

            mv.setViewName("redirect:/index");
        } catch (Exception e) {
            mv.addObject("msgError", e.getMessage());
            return mv;
        }
        return mv;
    }
}
