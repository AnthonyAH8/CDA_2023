package org.example.exerciceBuilderPizza;

public class Pizza {

    public enum Height {
        PETITE,
        MOYENNE,
        GRANDE
    }

    public enum Paste {
        CLASSIQUE,
        FINE,
        EPAISSE
    }

    public enum Cheese {
        SANSFROMAGE,
        CHEDDAR,
        MOZZARELLA
    }

    public enum Garniture {
        JAMBON,
        PEPPERONI,
        CHAMPIGNON,
        POIVRONS
    }

    public enum Sauce {
        TOMATE,
        CREMEFRAICHE,
        BARBECUE
    }

    private Height height;
    private Paste paste;
    private Cheese cheese;
    private Garniture garniture;
    private Sauce sauce;

    private Pizza(PizzaBuilder builder){
        this.height = builder.height;
        this.paste = builder.paste;
        this.cheese = builder.cheese;
        this.garniture = builder.garniture;
        this.sauce = builder.sauce;
    }

    @Override
    public String toString() {
        return "Pizza{" +
                "height='" + height + '\'' +
                ", paste='" + paste + '\'' +
                ", cheese='" + cheese + '\'' +
                ", garniture='" + garniture + '\'' +
                ", sauce='" + sauce + '\'' +
                '}';
    }

    public static class PizzaBuilder{
        private Height height;
        private Paste paste;
        private Cheese cheese;
        private Garniture garniture;
        private Sauce sauce;

        public PizzaBuilder height(Height height){
            this.height = height;
            return this;
        }

        public PizzaBuilder paste(Paste paste){
            this.paste = paste;
            return this;
        }

        public PizzaBuilder cheese(Cheese cheese){
            this.cheese = cheese;
            return this;
        }

        public PizzaBuilder garniture(Garniture garniture){
            this.garniture = garniture;
            return this;
        }

        public PizzaBuilder sauce(Sauce sauce){
            this.sauce = sauce;
            return this;
        }
        public Pizza build(){
            return new Pizza(this);
        }
    }
}
