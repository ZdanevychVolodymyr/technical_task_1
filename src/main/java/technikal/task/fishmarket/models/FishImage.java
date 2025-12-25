package technikal.task.fishmarket.models;

import jakarta.persistence.*;

    @Entity
    @Table(name = "fish_images")
    public class FishImage {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private int id;

        @Column(name = "fish_name")
        private String fileName;

        @ManyToOne
        @JoinColumn(name = "fish_id", nullable = false)
        private Fish fish;


        public FishImage(String fileName, Fish fish){
            this.fileName = fileName;
            this.fish = fish;
                    }

        public FishImage() {

        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getFileName(){return fileName;}

        public void setFileName(String fileName){
            this.fileName = fileName;
        }

        public Fish getFish() {
            return fish;
        }

        public void setFish(Fish fish) {
            this.fish = fish;
        }


    }





