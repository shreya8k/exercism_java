class Badge {
    public String print(Integer id, String name, String department) { 
        if(id==null){
            if(department ==null)return name+" - OWNER";
                else
            return name+" - "+department.toUpperCase();
        }
        else if (department ==null) return "["+String.valueOf(id)+"] - "+name+" - OWNER";
        return "["+String.valueOf(id)+"] - "+name+" - "+department.toUpperCase();
    }
}
