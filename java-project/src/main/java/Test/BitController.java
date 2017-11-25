package Test;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

import java100.app.domain.Score;

public class BitController  {
    protected ArrayList list = new ArrayList();
    private String dataFilePath;
    
    public BitController(String dataFilePath) throws Exception{
        this.dataFilePath = dataFilePath;
        this.init();
    }

    private void init() throws Exception {
        BufferedReader in = new BufferedReader(new FileReader(this.dataFilePath));
        
        String csv = null;
        while((csv = in.readLine()) != null) {
            list.add(new Score(csv));
        }
    }
    
    
}
