0 private double singleTax ()
0 {
0 
4 if (income <= 27050.0)
8 return (income * 0.15);
4 else if (income <= 65550.0)
8 return (4057.5 + (0.275 * (income - 27050.0)));
4 else if (income <= 136750.0)
8 return (14645.0 + (0.305 * (income - 65550.0)));
4 else if (income <= 297350.0)
8 return (36361.0 + (0.355 * (income - 136750.0)));
4 else
8 return (93374.0 + (0.391 * (income - 297350.0)));
0 }
