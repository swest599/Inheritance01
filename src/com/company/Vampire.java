package com.company;

    public class Vampire extends Monster {

        private String weakness0 = "Garlic";
        private String weakness1 = "Sunlight";


        public Vampire() {
            this.weakness0 = weakness0;
        }

        public void setWeakness0() {
            this.weakness0 = weakness0;
        }

        public String getWeakness0() {

            this.weakness0 = weakness0;
            return weakness0;
        }
        public void setWeakness1(){
            this.weakness1 = weakness1;

        }
        public String getWeakness1(){
            this.weakness1=weakness1;
            return weakness1;
        }
    }
