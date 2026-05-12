Lưu danh sách các bên cung cấp dược liệu, sản phẩm để phục vụ việc nhập kho.
Hiện tại chỉ quản lý các thông tin cơ bản như tên, địa chỉ, sđt.
Khách hàng không yêu cầu **xoá mềm**, có thể bỏ trường `status`.
Không yêu cầu quản lý thời gian truy vết khi tạo, sửa.
![[ERD.png]]
```C#
namespace Dong_Y_Cao_Spa_Management_System.Models
{
    public class Suppliers
    {
        public string SupplierID { get; set; } = string.Empty;
        public string SupplierName { get; set; } = string.Empty;
        public string Phone { get; set; } = string.Empty;
        public string Adress { get; set; } = string.Empty;
        public string Note { get; set; } = string.Empty;
    }
}
```