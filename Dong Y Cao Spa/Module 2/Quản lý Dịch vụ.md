Thiết lập các gói dịch vụ (ví dụ: Massage cổ vai gáy - 60 phút, Bấm huyệt - 30 phút).
Các dịch vụ của khách hàng được quản lý bằng gói (Packages) và có hỗ trợ trả một phần số tiền của gói (Một package có thể trả nhiều lần).
Payment dùng để quản lý lưu lượng tiền mua bán dịch vụ, tính toán công nợ của khách (Tìm tổng tiền nợ mỗi gói).
![[ERD.png]]
```C#
namespace Dong_Y_Cao_Spa_Management_System.Models

{
    public class SpaService
    {
        public string ServiceID { get; set; }
        public string ServiceName { get; set; }
        public string Status { get; set; }
        public int SessionNumber { get; set; }
        public string PerSessionDuration { get; set; }
        public double OriginalPrice { get; set; }
        public double SellingPrice { get; set; }
        public double PerSessionPrice { get; set; }
        public DateTime CreatedAt { get; set; }
        public DateTime UpdateAt { get; set; }
        public string Note { get; set; }
        public string GoodsType { get; set; }
    }
}
```