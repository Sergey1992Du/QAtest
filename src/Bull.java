public class Bull {
        double s;
        double v;
        public Bull (double radius){
            this.v = 4.0 / 3 * Math.PI* Math.pow(radius, 3);
            this.s = Math.PI* Math.pow(radius, 2)*4;
        }
    }
}
