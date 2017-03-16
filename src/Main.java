import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

public class Main {
    public static void main(String args[]){
        String fname="car_data.csv";
        BufferedReader br = null;
        String line = " ";
        String csvSep = ",";

        ArrayList<Car> CarList = new ArrayList<Car>();

        try {

            br = new BufferedReader(new FileReader(fname));
            while ((line = br.readLine()) != null) {

                String[] carsDetails = line.split(csvSep);
                Car c = new Car();
                c.setMake(carsDetails[0]);
                c.setModel(carsDetails[1]);
                c.setCurrentSpeed(Integer.parseInt(carsDetails[2]));
                c.setFuel(Double.parseDouble(carsDetails[3]));
                c.setBaseMpg(Double.parseDouble(carsDetails[4]));
                c.setScaleFactor(Double.parseDouble(carsDetails[5]));
                c.updateFuelRemaining(Double.parseDouble(carsDetails[6]));
                double mpg = c.getBaseMpg()- c.getScaleFactor() * c.getCurrentSpeed()+ 0.01* c.getCurrentSpeed()/20;
                c.setMpg(mpg);
                CarList.add(c);
            }

            PrintWriter writer = new PrintWriter("processed_cars.txt");
            for(int i=0;i<CarList.size();i++){
                Car c = CarList.get(i);
                writer.println("Make:   "+c.getMake()+" Model:   "+c.getModel()+" Current Speed:       "+c.getCurrentSpeed()
                        +" Mpg:       "+c.getBaseMpg()+" Fuel:    "+c.getFuel());
            }
            writer.close();
            System.out.println("All data has been processed");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (br != null) {
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }

}