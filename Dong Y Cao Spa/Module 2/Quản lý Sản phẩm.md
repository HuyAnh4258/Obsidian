Khai báo tên sản phẩm, giá vốn (giá nhập), giá bán lẻ, v.v....
Trường `status` có `activated` và `deactivated`, dùng cho xoá mềm.
Trường `quantity` và `threshold` dùng cho quản lý tồn kho được loại bỏ khỏi scope.
Trường `goodsType` được giữ nguyên để dự phòng cho module 3.
Trường nhập `Note` có thể để trống.
Sản phẩm được bán thủ công, không thông qua hệ thống.
![[ERD.png]]
```C#
namespace Dong_Y_Cao_Spa_Management_System.Models
{
    public class Products
    {
        public string ProductID { get; set; } = string.Empty;
        public string ProductName { get; set; } = string.Empty;
        public string Status { get; set; } = string.Empty;
        public double CostPrice { get; set; }
        public double SellingPrice { get; set; }
        public string Unit { get; set; } = string.Empty;
        public string GoodsType { get; set; } = string.Empty;
        public DateTime CreatedAt { get; set; }
        public DateTime UpdatedAt { get; set; }
        public string Note { get; set; } = string.Empty;
    }
}
```

