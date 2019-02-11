package com.example.batch.service;

import com.example.batch.model.Train;
import com.example.batch.repository.TrainRepository;
import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@Service
public class TrainService {

    @Autowired
    private TrainRepository repository;

    @Transactional
    public void saveTrain() {
        String path = "C:\\test\\train.csv";
        try {
            Reader in = new FileReader(path);
            Iterable<CSVRecord> records = CSVFormat.EXCEL.withHeader("date_time","site_name","posa_continent",
                    "user_location_country","user_location_region","user_location_city","orig_destination_distance",
                    "user_id","is_mobile","is_package","channel","srch_ci","srch_co","srch_adults_cnt","srch_children",
                    "srch_rm_cnt", "srch_destination_id", "srch_destination_type_id", "hotel_continent", "hotel_country",
                    "hotel_market", "is_booking", "cnt", "hotel_cluster").parse(in);
            records.iterator().next();

            int i = 0;
            List<Train> batch = new ArrayList<>();
//            records.forEach((record) -> repository.save(mapEntity(record)));
            for (CSVRecord record : records) {
                Train train = mapEntity(record);
                batch.add(train);
//                saveTrain(train);
//                repository.save(mapEntity(record));
                if(i % 10000 == 0) {
//                    bulkSave(batch);
                    repository.saveAll(batch);
                    repository.flush();
                    batch = new ArrayList<>();
                    System.out.println(i);
                }
                if (i++ >= 100000) {
//                    System.out.println(batch);
                    break;
                }
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void saveTrain(Train train) {
        repository.save(train);
    }

    //@Transactional
    public void bulkSave(Collection<Train> trains) {
        trains.forEach(simpleUser -> repository.save(simpleUser));
        repository.flush();
    }

    private Train mapEntity(CSVRecord record) {
        return new Train(record.get(0), Integer.parseInt(record.get(1)), Integer.parseInt(record.get(2)), Integer.parseInt(record.get(3)),
                Integer.parseInt(record.get(4)), Integer.parseInt(record.get(5)), record.get(6),
                Integer.parseInt(record.get(7)), Integer.parseInt(record.get(8)), Integer.parseInt(record.get(9)),
                Integer.parseInt(record.get(10)), record.get(11), record.get(12), Integer.parseInt(record.get(13)),
                Integer.parseInt(record.get(14)), Integer.parseInt(record.get(15)), Integer.parseInt(record.get(16)),
                Integer.parseInt(record.get(17)), Integer.parseInt(record.get(18)), Integer.parseInt(record.get(19)),
                Integer.parseInt(record.get(20)), Integer.parseInt(record.get(21)), Long.parseLong(record.get(22)),
                Integer.parseInt(record.get(23)));
    }


}
