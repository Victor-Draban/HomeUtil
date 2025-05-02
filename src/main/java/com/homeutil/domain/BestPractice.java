package com.homeutil.domain;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.index.CompoundIndex;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@NoArgsConstructor
@Document(collection = "best-practice")
@CompoundIndex(name = "unique_name_shortNote", def = "{'name': 1, 'shortNote': 1}", unique = true)
public class BestPractice {

    private String name;
    private String shortNote;
    private String description;

    public BestPractice(String name, String shortNote, String description) {
        this.name = name;
        this.shortNote = shortNote;
        this.description = description;
    }
}
