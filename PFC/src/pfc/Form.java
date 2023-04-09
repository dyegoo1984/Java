package pfc;

public class Form {
    public String separator = "* * * * * * * * * * * * * * * * * *";
    
    public String pointer = ">_";
    
    public String header = """
                           =================================================================
                           |                   Personal Finance Control                    |
                           =================================================================
                           """;
    
    public String menu_1 = """
                           
                           =================================================================
                                (1) Insert Expenses     (2) View Expenses
                                (3) Spending Chart      (4) Logout
                           =================================================================
                           """;
    public String menu_2 = """
                                Select the debit category: 
                                (1) Food                (2) Home                                            
                                (3) Services            (4) Health                                        
                                (5) Leisure             (6) Other
                           """;
        
    public String menu_3 = """
                           =================================================================
                                (1) Continue            (2) Return
                           =================================================================
                           """;
}
