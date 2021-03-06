package com.blog.blogmodelo.controller;


import com.blog.blogmodelo.model.Post;
import com.blog.blogmodelo.service.BlogModeloPostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;


import javax.validation.Valid;
import java.time.LocalDate;
import java.util.List;

@Controller
public class BlogModeloPostController {

    @Autowired
    BlogModeloPostService blogmodelopostservice;

    @RequestMapping(value = "/posts", method = RequestMethod.GET)
    public ModelAndView getPosts(){
        ModelAndView mv = new ModelAndView("posts");
        List<Post> posts = blogmodelopostservice.findAll();
        mv.addObject("posts", posts);
        return mv;
    }

    @RequestMapping(value = "/posts/{id}", method = RequestMethod.GET)
    public ModelAndView getPost(@PathVariable("id") long id){
        ModelAndView mv = new ModelAndView("postDetalhes");
       Post post = blogmodelopostservice.findById(id);
        mv.addObject("post", post);
        return mv;
    }
    //retornar apenas o formulario.
    @RequestMapping(value = "/novopost", method = RequestMethod.GET)
    public  String getPostForm(){
        return "postForm";
    }

    @RequestMapping(value = "/novopost", method = RequestMethod.POST)
    public  String savePost(@Valid Post post, BindingResult result, RedirectAttributes attributes) {
        attributes.addFlashAttribute("mensagem", "Verifique se os campos obrigatórios foram preenchidos!");
        if (result.hasErrors()) {
            return "redirect:/novopost";
        } else {
            post.setData(LocalDate.now());
            blogmodelopostservice.save(post);
            return "redirect:/posts";
        }
    }

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public  String getIndx(){

        return "index";
    }

}
