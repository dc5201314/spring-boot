package top.dc.springbootquickstart.service;

import org.springframework.stereotype.Service;
import top.dc.springbootquickstart.entity.Meeting;

import java.util.ArrayList;
import java.util.List;

@Service
public class MeetingService {
    private final List<Meeting> meetings = new ArrayList<>();
    /**
     * 检查会议室是否可⽤于新的会议（newMeeting）。
     *
     * @param newMeeting 要检查的新会议对象。
     * @return 如果会议室在新会议的时间段内可⽤，则返回 true；否则返回 false。
     */
    public boolean isRoomAvailable(Meeting newMeeting) {
        // 使⽤ Java Stream API 来检查会议列表中是否有与新会议重叠的会议
        return meetings.stream()
                // 如果存在任何与新会议时间重叠的现有会议，返回 false
                .noneMatch(existingMeeting -> existingMeeting.isOverlapping(newMeeting));
    }
    public void addMeeting(Meeting meeting) {
        meetings.add(meeting);
    }
}
