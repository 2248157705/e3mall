package cn.e3mall.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cn.e3mall.pojo.TbItem;
import cn.e3mall.service.ItemService;

@RestController
public class ItemController {
   @Autowired
   private ItemService itemService;
   @RequestMapping("findItemById/{id}")
   public TbItem findItemById(@PathVariable("id")Long id){
	   System.out.println(id);
	  TbItem item= itemService.findItemById(id);
	  System.out.println("执行了");
	  System.out.println(item);
	  return item;
   }
}
