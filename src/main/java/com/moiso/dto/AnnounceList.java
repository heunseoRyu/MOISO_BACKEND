package com.moiso.dto;

import com.moiso.entity.Announce;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
@AllArgsConstructor
public class AnnounceList {
    private Long id;
    private String title;
    private String reward;

    public static AnnounceList of(Announce announce){
        return AnnounceList.builder()
                .id(announce.getId())
                .title(announce.getTitle())
                .reward(announce.getReward()).build();
    }
}
