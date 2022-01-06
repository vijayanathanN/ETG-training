﻿using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;
using Bakery.Data.Configurations;
using Bakery.Models;
using Microsoft.EntityFrameworkCore;

namespace Bakery.Data
{
    public class BakeryContext : DbContext
    {
        public DbSet<Product> Products { get; set; }

        protected override void OnConfiguring(DbContextOptionsBuilder optionsBuilder)
        {
            optionsBuilder.UseSqlite(@"Data source=Bakery.db");
        }
        protected override void OnModelCreating(ModelBuilder modelBuilder)
        {
            modelBuilder.ApplyConfiguration(new ProductConfiguration()).Seed();
        }
    }
}

