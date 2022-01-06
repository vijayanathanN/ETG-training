using System;
using System.Collections.Generic;
using System.ComponentModel.DataAnnotations;
using System.Linq;
using System.Threading.Tasks;

namespace WebAppMVC.Models
{
    public class MyTask
    {
        [Required]
        public string description { get; set; }
        [Required]
        public string owner { get; set; }
    }
}
