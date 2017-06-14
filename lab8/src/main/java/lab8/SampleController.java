package lab8;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SampleController {
    @RequestMapping(value = "/", method = RequestMethod.GET)
    @ResponseBody
    String getDrugInfo(@RequestParam String drug) {
        return CacheManager.getPharmaInfo(drug);
    }

    @RequestMapping(value = "/", method = RequestMethod.DELETE)
    @ResponseBody
    void deleteCache(@RequestParam String drug) {
        CacheManager.memcachedClient.delete(drug);
    }
}