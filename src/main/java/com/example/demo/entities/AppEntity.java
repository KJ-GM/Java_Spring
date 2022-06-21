package com.example.demo.entities;


import com.example.demo.enums.RecordState;
import lombok.*;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Getter
@Setter
@RequiredArgsConstructor
@EqualsAndHashCode
@MappedSuperclass
@ToString
public abstract class AppEntity<ID extends Serializable> {
    @CreatedDate
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "CREATED_AT", updatable = false)
    protected Date createdDate;

    @LastModifiedDate
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "UPDATED_AT")
    protected Date updatedDate;

    @Column(name = "RECORD_STATE", nullable = false)
    @Enumerated(value = EnumType.ORDINAL)
    protected RecordState recordState;
}
