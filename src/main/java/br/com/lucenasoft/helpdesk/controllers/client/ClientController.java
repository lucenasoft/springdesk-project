package br.com.lucenasoft.helpdesk.controllers.client;

import br.com.lucenasoft.helpdesk.Enums.ProfileEnum;
import br.com.lucenasoft.helpdesk.models.ClientModel;
import br.com.lucenasoft.helpdesk.repositories.ClientRepository;
import br.com.lucenasoft.helpdesk.utils.UploadImg;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("client")
public class ClientController {

    @Autowired
    private ClientRepository repository;

    @GetMapping("/register")
    public ModelAndView register(ClientModel client) {
        ModelAndView mv = new ModelAndView("client/register");
        mv.addObject("user", new ClientModel());
        mv.addObject("profiles", ProfileEnum.values());
        return mv;
    }

    @PostMapping("/register")
    public ModelAndView register(@ModelAttribute ClientModel client, @RequestParam("file")MultipartFile img){
        ModelAndView mv = new ModelAndView("client/register");
        mv.addObject("user", client);

        try {
            if(UploadImg.uploadImg(img)) {
                client.setImgURL(img.getOriginalFilename());
            }
            repository.save(client);

            return home();
        } catch (Exception e) {
            mv.addObject("msgError", e.getMessage());
            return mv;
        }
    }

    @GetMapping("/index")
    public ModelAndView home(){
        return new ModelAndView("home/index");
    }
}
