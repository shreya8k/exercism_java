class Darts {
    int score(double xOfDart, double yOfDart) {
        double dist=Math.sqrt(xOfDart*xOfDart+yOfDart*yOfDart);
        int s=0;
        if(dist<=1.0)s+=10;
        else if(dist<=5.0)s+=5;
        else if(dist<=10.0)s+=1;
        else s+=0;
        return s;
    }
}
