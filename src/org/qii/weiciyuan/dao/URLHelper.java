package org.qii.weiciyuan.dao;

import org.qii.weiciyuan.support.http.URLManager;

/**
 * User: qii
 * Date: 12-7-28
 */
public class URLHelper {

    public static String getEmotions() {
        return URLManager.getRealUrl("emotions");
    }


    public static String getFriendsTimeLine() {
        return URLManager.getRealUrl("friendstimeline");
    }

    public static String getBilateralTimeLine() {
        return URLManager.getRealUrl("bilateral");
    }

    public static String getMentionsTimeLine() {

        return URLManager.getRealUrl("mentionstimeline");

    }

    public static String getCommentList() {
        return URLManager.getRealUrl("commentstimeline");
    }

    public static String getCommentListByMe() {
        return URLManager.getRealUrl("commentsbyme");
    }

    public static String getCommentListById() {
        return URLManager.getRealUrl("commentstimelinebymsgid");
    }

    public static String getRepostListById() {
        return URLManager.getRealUrl("repoststimelinebymsgid");
    }

    public static String getTags() {
        return URLManager.getRealUrl("tags");
    }

    public static String getStatuses_Show() {
        return URLManager.getRealUrl("statuses_show");
    }

    public static String new_Repost() {
        return URLManager.getRealUrl("repost_create");
    }

    public static String new_Comment() {
        return URLManager.getRealUrl("comment_create");
    }

    public static String remove_Comment() {
        return URLManager.getRealUrl("comment_destroy");
    }

    public static String reply_Comment() {
        return URLManager.getRealUrl("comment_reply");
    }

    public static String getUser() {
        return URLManager.getRealUrl("user_show");
    }

    public static String getStatusesTimeLineById() {
        return URLManager.getRealUrl("statusestimelinebyid");
    }

    public static String getFriendListById() {
        return URLManager.getRealUrl("friendsbyid");
    }

    public static String getFanListById() {
        return URLManager.getRealUrl("followersbyid");
    }

    public static String getFavList() {
        return URLManager.getRealUrl("myfav");
    }

    public static String getFollowitUrl() {
        return URLManager.getRealUrl("followit");
    }

    public static String getUnFollowitUrl() {
        return URLManager.getRealUrl("unfollowit");
    }

    public static String getFavitUrl() {
        return URLManager.getRealUrl("favit");
    }

    public static String getUnFavitUrl() {
        return URLManager.getRealUrl("unfavit");
    }

    public static String getRemoveFanUrl() {
        return URLManager.getRealUrl("removefan");
    }

    public static String getGoogleLocatonUrl() {
        return URLManager.getGoogleRealUrl("googlelocation");
    }

    public static String getDestroyStatus() {
        return URLManager.getRealUrl("status_destroy");
    }

    public static String getSearchTopicByName() {
        return URLManager.getRealUrl("topic_search");
    }

    public static String getUnread() {
        return URLManager.getRealUrl("unread_count");
    }

    public static String getClearUnread() {
        return URLManager.getRealUrl("unread_clear");
    }

    public static String getRemarkUpdate() {
        return URLManager.getRealUrl("remark_update");
    }

    public static String getAtUser() {
        return URLManager.getRealUrl("atuser");
    }
}
