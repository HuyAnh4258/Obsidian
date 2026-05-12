___
### PHẦN 1: QUẢN LÝ THÔNG TIN KHÁCH HÀNG (MODULE 1 - CIM)

Mục tiêu: Xây dựng cơ sở dữ liệu khách hàng tập trung, giúp Spa nhận diện và chăm sóc khách hàng chuyên nghiệp ngay từ lần đầu tiên.

1. Các chức năng chính:

- Đăng ký khách hàng mới: Lưu trữ các thông tin cơ bản (Họ tên, Số điện thoại, Địa chỉ, Ngày sinh, Giới tính).
    
- Tra cứu lịch sử khách hàng: Tìm kiếm nhanh khách hàng qua Số điện thoại hoặc Tên để xem hồ sơ.
    
- Cập nhật thông tin: Thay đổi địa chỉ, số điện thoại hoặc các ghi chú đặc biệt.
    
- Quản lý trạng thái: Đánh giá khách hàng đang hoạt động hoặc tạm ngừng phục vụ.
    

2. Giải thích luồng nghiệp vụ (Dành cho khách hàng): Khi một khách hàng mới đến Spa, nhân viên sẽ nhập Số điện thoại vào hệ thống. Hệ thống sẽ tự động kiểm tra:

- Nếu đã có trong hệ thống: Hiển thị ngay lịch sử các gói liệu trình khách đã mua và công nợ cũ (nếu có) để nhân viên chào hỏi đúng tên. (opt)
    
- Nếu chưa có: Nhân viên tạo mới hồ sơ. Hệ thống quy định Số điện thoại là duy nhất để tránh việc một khách hàng bị trùng lặp nhiều tài khoản, gây nhầm lẫn về công nợ hoặc số buổi liệu trình còn lại.
    
- Lưu ý quan trọng: Hệ thống vẫn cho phép ngừng hoạt động một khách hàng nếu họ vẫn còn nợ tiền hoặc vẫn còn buổi trong gói liệu trình chưa sử dụng hết.
    

  

### PHẦN 2: QUẢN LÝ SẢN PHẨM & DỊCH VỤ (MODULE 2 - GM)

Mục tiêu: Quản lý chặt chẽ danh mục hàng hóa (dầu massage, thuốc đông y...) và các loại dịch vụ liệu trình tại Spa.

1. Các chức năng chính:

- [[Quản lý Sản phẩm]] (Hàng hóa): Khai báo tên sản phẩm, giá vốn (giá nhập), giá bán lẻ.
    
- [[Quản lý Dịch vụ]] (Liệu trình): Thiết lập các gói dịch vụ (ví dụ: Massage cổ vai gáy - 60 phút, Bấm huyệt - 30 phút).
    
- [[Quản lý Nhà cung cấp]]: Lưu danh sách các bên cung cấp dược liệu, sản phẩm để phục vụ việc nhập kho. **(nhiều NCC)**
    

2. Giải thích luồng nghiệp vụ (Dành cho khách hàng):

- [[Thiết lập giá thông minh]]: Khi chủ Spa nhập giá bán cho một sản phẩm, nếu vô tình nhập giá bán thấp hơn giá vốn (giá nhập từ nhà cung cấp), hệ thống sẽ cảnh báo ngay lập tức để tránh kinh doanh lỗ.(opt)
    
- [[Quản lý liệu trình theo buổi]]: Đối với các dịch vụ, hệ thống cho phép cài đặt số buổi mặc định (ví dụ gói 10 buổi). Điều này là tiền đề để khi khách đi thực hiện dịch vụ, hệ thống có thể tự động trừ số buổi còn lại một cách chính xác.
    

 Có hay có chương trình khuyến mãi/giảm giá theo khách VIP hay không?

### PHẦN 3: QUẢN LÝ GÓI LIỆU TRÌNH (MODULE 3 - TPM)

Mục tiêu: Quản lý các thẻ liệu trình gồm nhiều buổi mà khách hàng đã mua, đảm bảo tính minh bạch trong việc sử dụng và số buổi còn lại.

1. Các chức năng chính:

- Đăng ký Gói liệu trình cho khách: Ghi nhận việc khách mua một bộ các buổi dịch vụ (ví dụ: Gói 10 buổi tặng 2 buổi).
    
- Theo dõi số buổi sử dụng: Tự động trừ số buổi sau mỗi lần khách đến làm dịch vụ.
    
- Quản lý trạng thái gói: Biết được gói nào đang sử dụng (Active), gói nào đã hết buổi (Completed).
    
- Tra cứu lịch sử sử dụng: Xem lại chi tiết khách đã đi vào những ngày nào, còn lại bao nhiêu buổi.
    

2. Giải thích luồng nghiệp vụ (Dành cho khách hàng):

- Bán gói linh hoạt: Khi khách hàng mua gói "Massage 10 buổi tặng 5 buổi", hệ thống sẽ ghi nhận tổng là 15 buổi. Chủ Spa không cần phải nhớ hay ghi sổ tay, vì hệ thống sẽ quản lý con số này.
    
- Tự động hóa hoàn toàn: Mỗi khi nhân viên lễ tân xác nhận khách đã làm xong dịch vụ ở Module 4 (Đặt lịch), hệ thống sẽ tự động trừ 1 buổi trong gói tương ứng của khách.
    
- Quy tắc "Cái nào mua trước dùng trước": Nếu khách hàng mua 2 gói giống nhau vào 2 thời điểm khác nhau, hệ thống sẽ ưu tiên trừ hết các buổi của gói cũ rồi mới chuyển sang gói mới, giúp quản lý thẻ liệu trình cực kỳ khoa học. (opt)
    

  

### PHẦN 4: ĐẶT LỊCH HẸN CHO KHÁCH HÀNG (MODULE 4 - ASM)

Mục tiêu: Sắp xếp thời gian phục vụ chuyên nghiệp, tránh việc khách đến phải chờ đợi quá lâu hoặc trùng lịch của nhân viên.

1. Các chức năng chính:

- Đặt lịch mới (Booking): Ghi nhận ngày giờ khách hẹn, dịch vụ khách muốn làm và nhân viên phục vụ yêu cầu.
    
- Màn hình theo dõi lịch hẹn (Calendar View): Hiển thị danh sách khách hẹn trong ngày/tuần để chủ Spa dễ dàng điều phối.
    
- Tiếp nhận khách (Check-in): Đánh dấu khách đã đến Spa và bắt đầu thực hiện dịch vụ.
    
- Hủy hoặc đổi lịch: Cho phép dời giờ hẹn hoặc hủy lịch khi khách có việc bận đột xuất.
    

2. Giải thích luồng nghiệp vụ (Dành cho khách hàng):

- Chuyên nghiệp hóa khâu đón tiếp: Khi khách gọi điện đặt lịch, nhân viên chỉ cần vài giây để kiểm tra xem giờ đó còn trống hay không. Hệ thống sẽ tự động tính toán thời gian kết thúc dựa trên loại dịch vụ (ví dụ: Massage 60 phút thì sẽ giữ chỗ trong đúng 60 phút).
    
- Tránh trùng lịch: Hệ thống sẽ cảnh báo nếu có khách khác đặt vào cùng khung giờ, giúp Spa tránh được những tình huống khó xử với khách.
    
- Kết nối thông minh: Khi khách làm xong, trạng thái lịch hẹn chuyển thành "Hoàn thành", ngay lập tức hệ thống sẽ cập nhật sang Module Gói liệu trình để trừ buổi và Module Công nợ để ghi nhận tiền.
    

  

### PHẦN 5: QUẢN LÝ CÔNG NỢ & THANH TOÁN (MODULE 5 - DM)

Mục tiêu: Kiểm soát chặt chẽ tiền nợ của khách hàng khi mua gói liệu trình, tránh thất thoát và quản lý dòng tiền trả góp.

1. Các chức năng chính:

- Ghi nhận thanh toán: Lưu lại các lần khách trả tiền (trả hết một lần hoặc trả làm nhiều đợt).
    
- Theo dõi nợ theo từng gói: Biết chính xác khách còn nợ bao nhiêu tiền cho mỗi gói liệu trình họ đã mua.
    
- Báo cáo danh sách nợ: Tổng hợp tất cả khách hàng đang nợ tiền để chủ Spa có kế hoạch thu hồi nợ.
    
- Nhật ký thu tiền: Xem lại lịch sử các đợt khách đã thanh toán (ngày nào, số tiền bao nhiêu, trả bằng tiền mặt hay chuyển khoản).
    

2. Giải thích luồng nghiệp vụ (Dành cho khách hàng):

- Quản lý trả góp: Với các gói liệu trình trị giá cao, khách thường không trả hết ngay. Hệ thống cho phép nhân viên thu tiền nhiều lần. Ví dụ: Gói 10 triệu, khách trả trước 3 triệu, hệ thống sẽ tự động treo nợ 7 triệu và nhắc nhở nhân viên mỗi khi khách đến làm.
    
- Đối soát minh bạch: Mỗi lần khách trả tiền, hệ thống sinh ra một mã phiếu thu(hay là nhân viên nhập tay?). Cả khách và Spa đều có thể kiểm tra lại lịch sử trả tiền bất cứ lúc nào, tránh việc tranh cãi "tôi đã trả rồi" hay "chưa trả".
    
- Chặt chẽ về tài chính: Hệ thống sẽ không cho phép nhân viên thu tiền vượt quá số tiền khách nợ. Đồng thời, báo cáo công nợ sẽ giúp chủ Spa nắm bắt được "tổng số tiền đang nằm ở khách hàng" là bao nhiêu để chủ động tài chính.
    

các phương thức thanh toán họ thường dùng (Tiền mặt, Chuyển khoản, Quẹt thẻ) để mình đưa vào danh mục lựa chọn

  

nhập xuất FILE EXCEL KHÁCH HÀNG

  

 ngày giao dịch cuối (ngày ghé thăm gần nhất)

ngày giao dịch đầu (ngày ghé thăm đầu tiên)

phiếu mua => công nợ, tổng thu từ khách

**