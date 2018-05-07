package com.yoga.services.controller

import org.slf4j.Logger
import org.slf4j.LoggerFactory
import org.springframework.stereotype.Controller
import org.springframework.ui.ModelMap
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestMethod
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.servlet.ModelAndView

import javax.servlet.http.HttpServletResponse

/**
 * Main controller for all user interactions
 */
@Controller
public class HelloController {
    private final Logger log = LoggerFactory.getLogger(this.getClass());

    /**
     * Default get method returns new welcome page
     * @return welcome.jsp
     */
    @RequestMapping()
    public ModelAndView home() {
        log.info("reached default get returning welcome ");
        NewModel newModel = new NewModel();
        return new ModelAndView("welcome", "command", newModel);
    }

    /**
     * Second view returns distance from A-b with other options like weather...
     * @param origin
     * @param destination
     * @param model
     * @param response
     * @return details
     */
    @RequestMapping(value = "/distance/s", method = RequestMethod.POST)
    public ModelAndView de(@RequestParam(value = "origin", required = false) String origin,
                           @RequestParam(value = "destination", required = false) String destination, ModelMap model, HttpServletResponse response) {

        try {

            return new ModelAndView("details", "command", model);
        } catch (Exception e) {
            return new ModelAndView("Error", "command", e);
        }

    }

    class NewModel{
        String origin
        String destination

        String getOrigin() {
            return origin
        }

        void setOrigin(String origin) {
            this.origin = origin
        }

        String getDestination() {
            return destination
        }

        void setDestination(String destination) {
            this.destination = destination
        }
    }
}
