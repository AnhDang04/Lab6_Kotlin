package com.example.lab6_kotlin

enum class ListType {
    ROW, COLUMN, GRID
}

data class Movie(
    val title: String,
    val year: String,
    val posterUrl: String,
    val duration: String,
    val shotDescription: String,
    val genre: String,
    val releaseDate: String,
) {
    companion object {
        fun getSampleMovies() = listOf(
            Movie(
                "Dune :Hành Tinh Cát - Phần Hai",
                "2024",
                "https://upload.wikimedia.org/wikipedia/vi/9/94/Dune_2_VN_poster.jpg",
                "180",
                "Dune: Hành Tinh Cát – Phần 2” sẽ tiếp tục khám phá hành trình đậm chất thần thoại của Paul Atreides khi anh đồng hành cùng Chani và những người Fremen trên chặng đường trả thù những kẻ đã hủy hoại gia đình mình. Đối mặt với những lựa chọn giữa tình yêu của cuộc đời mình và số phận của vũ trụ, Paul phải ngăn chặn viễn cảnh tương lai tồi tệ chỉ mình anh nhìn thấy.",
                "Hành Động ,Khoa Học Viễn Tưởng",
                "25/02/2024"
            ),
            Movie(
                "Mai",
                "2024",
                "https://iguov8nhvyobj.vcdn.cloud/media/catalog/product/cache/1/image/c5f0a1eff4c394a251036189ccddaacd/4/7/470x700-kungfupanda4.jpg",
                "145",
                "\"Mai\" xoay quanh cuộc đời của một người phụ nữ đẹp tên Mai (do Phương Anh Đào thủ vai) có số phận rất đặc biệt. Bởi làm nghề mát xa, Mai thường phải đối mặt với ánh nhìn soi mói, phán xét từ những người xung quanh. Và rồi Mai gặp Dương (Tuấn Trần) - chàng trai đào hoa lãng tử. Những tưởng bản thân không còn thiết tha yêu đương và mưu cầu hạnh phúc cho riêng mình thì khao khát được sống một cuộc đời mới trong Mai trỗi dậy khi Dương tấn công cô không khoan nhượng. Họ cho mình những khoảnh khắc tự do, say đắm và tràn đầy tiếng cười. Liệu cặp đôi ấy có nắm giữ được niềm hạnh phúc đó dài lâu khi miệng đời lắm khi cay nghiệt, bất công? \"Mai\" - một câu chuyện tâm lý, tình cảm pha lẫn nhiều tràng cười vui nhộn với sự đầu tư mạnh tay nhất trong ba phim của Trấn Thành hứa hẹn sẽ đem đến cho khán giả những phút giây thật sự ý nghĩa trong mùa Tết năm nay.",
                " Tình cảm,Tâm Lý,",
                "01/02/2024"
            ),
            Movie(
                "ĐÀO,PHỞ VÀ PIANO",
                "2024",
                "https://iguov8nhvyobj.vcdn.cloud/media/catalog/product/cache/1/image/c5f0a1eff4c394a251036189ccddaacd/4/7/470x700-kungfupanda4.jpg",
                "115",
                "Đào, Phở và Piano lấy bối cảnh trận chiến Đông Xuân kéo dài 60 ngày đêm từ cuối năm 1946 đến đầu năm 1947 ở Hà Nội. Câu chuyện theo chân chàng dân quân Văn Dân (Doãn Quốc Đam đóng) và chuyện tình với nàng tiểu thư đam mê dương cầm Thục Hương (Cao Thị Thùy Linh thủ vai). Khi những người khác đã di tản lên chiến khu, họ quyết định cố thủ lại mảnh đất Thủ đô đã tan hoang vì bom đạn, mặc cho những hiểm nguy đang chờ đợi trước mắt.",
                "Tình Cảm,Sử Thi",
                "22/02/2024"
            ),
            Movie(
                "Bà Thím Báo Thù",
                "2024",
                "https://iguov8nhvyobj.vcdn.cloud/media/catalog/product/cache/1/image/c5f0a1eff4c394a251036189ccddaacd/4/7/470x700-kungfupanda4.jpg",
                "125",
                "Kẻ lừa tiền “quay xe”, cầu cứu sự trợ giúp từ chính nạn nhân mà mình đã lừa đảo! Đang chật vật vay mượn khắp nơi để tiếp tục duy trì cửa tiệm giặt ủi sau hoả hoạn, Duk Hee nhận được cú điện thoại từ Son, tự xưng là nhân viên ngân hàng với lời hứa hẹn sẽ cấp cho cô một khoản vay với lãi suất ưu đãi. Tuy nhiên, Son yêu cầu Duk Hee phải gửi trước cho anh ta một khoản tiền gọi là “phí vay mượn”. Sau khi chuyển tiền, người phụ nữ tội nghiệp mới bàng hoàng nhận ra mình vừa trở thành nạn nhân của một kẻ chuyên lừa đảo qua điện thoại di động. Cú lừa này đã khiến Duk Hee mất toàn bộ tài sản và đối mặt với nguy cơ bị tống ra đường cùng hai đứa con. Giận dữ, oán trách nhưng Duk Hee nghĩ rằng cô sẽ không thể tìm được danh tính của Son. Cho tới một ngày nọ, Son bỗng chủ động liên lạc với Duk Hee và đưa ra một lời cầu cứu thảm thiết…",
                "Phim Hài,Hành Động",
                "28/02/2024"
            ),



            )
    }
}