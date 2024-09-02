package top.dc.springbootquickstart.contraller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import top.dc.springbootquickstart.entity.Meeting;
import top.dc.springbootquickstart.service.MeetingService;

@RestController
@RequestMapping("/meetings")
public class MeetingController {
    private final MeetingService meetingService;
    public MeetingController(MeetingService meetingService) {
        this.meetingService = meetingService;
    }
    /**
     * 检查会议室是否在指定的时间段内可⽤，并根据可⽤性预订会议。
     *
     * @param meeting 通过请求体传⼊的会议对象，包含会议的⽇期和时间信息。
     * @return 如果会议室可⽤，返回 HTTP 状态码 200（OK）和成功消息；如果不可⽤，返
    回 HTTP 状态码 409（Conflict）和失败消息。
     */
    @PostMapping("/check")
    public ResponseEntity<String> checkAvailability(@RequestBody Meeting meeting) {
        // 调⽤服务⽅法检查会议室是否在该时间段内可⽤
        if (meetingService.isRoomAvailable(meeting)) {
            // 如果会议室可⽤，则添加会议并返回成功消息
            meetingService.addMeeting(meeting);
            return ResponseEntity.ok("会议室可⽤，会议已预订！");
        } else {
            // 如果会议室不可⽤，返回冲突状态和不可⽤的提示信息
            return ResponseEntity.status(409).body("会议室不可⽤！");
        }
    }
}
