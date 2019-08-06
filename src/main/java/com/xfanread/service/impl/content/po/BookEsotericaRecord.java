package com.xfanread.service.impl.content.po;

public class BookEsotericaRecord {
    private Integer bookId;

    private Long memberId;

    private Integer previewSum;

    private Integer shareSum;

    private Integer emailSum;

    public Integer getBookId() {
        return bookId;
    }

    public void setBookId(Integer bookId) {
        this.bookId = bookId;
    }

    public Long getMemberId() {
        return memberId;
    }

    public void setMemberId(Long memberId) {
        this.memberId = memberId;
    }

    public Integer getPreviewSum() {
        return previewSum;
    }

    public void setPreviewSum(Integer previewSum) {
        this.previewSum = previewSum;
    }

    public Integer getShareSum() {
        return shareSum;
    }

    public void setShareSum(Integer shareSum) {
        this.shareSum = shareSum;
    }

    public Integer getEmailSum() {
        return emailSum;
    }

    public void setEmailSum(Integer emailSum) {
        this.emailSum = emailSum;
    }
}