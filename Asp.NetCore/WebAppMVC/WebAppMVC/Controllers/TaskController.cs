using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;
using Microsoft.AspNetCore.Mvc;
using WebAppMVC.Models;

namespace WebAppMVC.Controllers
{
    public class TaskController:Controller
    {
        public IActionResult Index()
        {
            return View();

        }
        public IActionResult List()
        {
            List<MyTask> list = new List<MyTask> { new MyTask { description = "MVC", owner = "VJ" } };
            return View(list);
        }

        //public IActionResult Search(string owner)
        //{
        //    IEnumerable<MyTask> list = _context.MyTask.Where(x => x.owner == owner);
        //    return View(list);
        //}
    }
}
