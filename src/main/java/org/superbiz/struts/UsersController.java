package org.superbiz.struts;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class UsersController {

    private UserRepository userRepository;

    public UsersController(UserRepository userRepository)
    {
        this.userRepository = userRepository;
    }

    @GetMapping("/addUser")
    public String addUserForm() {
        return "addUserForm";
    }

    @PostMapping("/addUser")
    public String addUserForm(@RequestParam String id, @RequestParam String firstName, @RequestParam String lastName) {
        User user = new User(new Long(id),firstName, lastName);
        userRepository.save(user);
        return "addedUser";
    }

    /*@PostMapping("/addUser")
    public String addUserForm(@RequestBody User user) {
        userService.add(user);
        return "addedUser";
    }*/

    @GetMapping("/findUser")
    public String findUserForm() {
        return "findUserForm";
    }

    @PostMapping("/findUser")
    public String findUser(@RequestParam long id, Model model) {
        User user = userRepository.findOne(id);

        if (user == null) {
            model.addAttribute("errorMessage", "User not found");
            return "findUserForm";
        }

        model.addAttribute("user", user);
        return "displayUser";
    }

    @GetMapping("/list")
    public String listUsers(Model model) {
        model.addAttribute("users", userRepository.findAll());
        return "displayUsers";
    }
}
