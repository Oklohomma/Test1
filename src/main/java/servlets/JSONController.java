package servlets;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import ru.javabegin.training.springlibrary.entities.Provider;

@Controller
@RequestMapping("/kfc/brands")
public class JSONController {

	@RequestMapping(value = "{id1}", method = RequestMethod.GET)
	public @ResponseBody
	Provider getShopInJSON(@PathVariable int id1) {

		Provider pr = new Provider();
		pr.setKodProvider(id1);
		//shop.setStaffName(new String[] { "mkyong1", "mkyong2" });

		return pr;

	}

}