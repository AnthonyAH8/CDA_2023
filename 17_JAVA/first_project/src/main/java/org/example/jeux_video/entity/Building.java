package org.example.jeux_video.entity;

public abstract class Building {
    private String style;
    private double size;
    //    private String specialFeatures;
    private String name;

    public abstract class Caserne{
        public abstract void createCaserne();
    }

    private Building(BuildingBuilder builder){
        this.style = builder.style;
        this.size = builder.size;
        this.name = builder.name;
    }

    @Override
    public String toString() {
        return "Building{" +
                "style='" + style + '\'' +
                ", size=" + size +
                ", name='" + name + '\'' +
                '}';
    }

    public static class BuildingBuilder{
        private String style;
        private double size;
        private String name;

        public BuildingBuilder style(String style){
            this.style = style;
            return this;
        }

        public BuildingBuilder size(double size){
            this.size = size;
            return this;
        }

        public BuildingBuilder name(String name){
            this.name = name;
            return this;
        }

        public Building build(){
            return new Building(this) {
            };
        }
    }
}
