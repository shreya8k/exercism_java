class CalculatorConundrum {
    public String calculate(int operand1, int operand2, String operation) {
       
            if(operation=="+")
                return operand1+" + "+operand2+" = "+(operand1+operand2);
            else if(operation=="*")
                return operand1+" * "+operand2+" = "+(operand1*operand2);
            else if(operation=="/"){
                    try{
                        return operand1+" / "+operand2+" = "+(operand1/operand2);
                    }catch(ArithmeticException e){
                        throw new IllegalOperationException("Division by zero is not allowed", e);
                
                    }
            }
            else if(operation==""){
                throw new IllegalArgumentException("Operation cannot be empty");
            }
            else if(operation==null)
                throw new IllegalArgumentException("Operation cannot be null");
            else 
                throw new IllegalOperationException("Operation '"+operation+"' does not exist");
            
            
    }
}
