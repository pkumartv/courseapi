package com.pv.courseapi.topic;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class TopicService {

    private List<Topic>  topics=Arrays.asList( 
        new Topic("one", "topic1", "topic1 desc"),
        new Topic("two", "topic2", "topic1 desc"),
        new Topic("three", "topic3", "topic1 desc")
    
    );

    public List<Topic> getAllTopics() {
        return topics;
    }    
    
}
