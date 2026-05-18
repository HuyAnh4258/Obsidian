# Kotoba Obsidian Vault

This directory is an Obsidian vault named **Kotoba** (Japanese for "words" or "language"), designed for systematic Japanese vocabulary study. It focuses on Kanji, meanings, Sino-Vietnamese (Hán Việt) readings, and word relationships.

## Project Overview

-   **Purpose:** A personal knowledge base for learning Japanese vocabulary.
-   **Primary Language:** Explanations and meanings are written in **Vietnamese**.
-   **Key Focus:** Kanji, Hán Việt, synonyms, antonyms, and collocations.
-   **Themes & Styling:** Uses the **Minimal** theme for a clean interface.

## Directory Structure

-   `New Words/`: The primary storage for detailed vocabulary notes.
-   `Template - Staging/`: Contains templates used to ensure consistent note structure.
    -   `[[New Word Template]].md`: The master template for vocabulary entries.
    -   `[[Link Template]].md`: Reference for creating ruby-formatted links.
-   `Root Directory`: Contains several `.md` files that act as placeholders or high-level categories for specific terms.
-   `.obsidian/`: Configuration files, including community plugins and workspace settings.

## Note Conventions

### Vocabulary Entry Structure
Notes in `New Words/` follow a specific table-based layout:
1.  **Header Table:** Contains STT (Sequence), Hán Tự (Kanji), Cách đọc (Hiragana reading), Hán Việt, and Ý nghĩa (Meaning).
2.  **Câu ví dụ:** Example sentences demonstrating usage.
3.  **Mở rộng từ vựng:** Vocabulary expansion categorized by:
    -   `類` (Synonyms)
    -   `対` (Antonyms)
    -   `合` (Compound words)
    -   `関` (Related words)
    -   `連` (Collocations/Usage)
    -   `[[慣]]` (Idioms/Common phrases)

### Tagging System
Use the specific tags for parts of speech:
- Danh từ: `#名`
- Danh động từ (suru-verb): `#名・スル`
- Động từ (Tự động từ): `#動 #自`
- Động từ (Tha động từ): `#動 #他`
- Tính từ đuôi na: `#ナ形`
- Tính từ đuôi i: `#イ形`
- Trạng từ: `#副`
- Chữ Hán: `#kanji`

### Backlink Rules
- **Kanji:** Khi một từ vựng nhắc đến một Kanji chưa có nội dung, hệ thống sẽ sử dụng `[[Kanji Template]].md` để khởi tạo ghi chú tương ứng.
- **Tự động hóa:** Các Kanji notes có thể tích hợp block Dataview để tự động query các từ vựng có chứa chữ Hán đó.

### Link Formatting & Furigana (CRITICAL)
The vault uses the `japanese-novel-ruby` plugin for furigana (ruby text) support. Links should follow this syntax:
`[Kanji《Reading》](TargetNote)`

Example: `[理想《りそう》](理想)`

**CRITICAL RULE FOR EXAMPLES:** 
All Kanji characters appearing in the "Câu ví dụ" (Example sentences) and "Mở rộng từ vựng" (Vocabulary Expansions) MUST have furigana applied using the `[Kanji《Reading》](Kanji)` syntax, EXCEPT for the main target word of the note, which should just be **bolded** (e.g., **男性**). Never leave regular Kanji without Furigana in these sections.

## Key Plugins

-   **Japanese Novel Ruby:** Enables the `《...》` syntax for furigana.
-   **Japanese Word Splitter:** Assists in segmenting Japanese text for better analysis.
-   **Terminal:** Integrated terminal for running CLI tools within Obsidian.

## Usage Guidelines

-   When adding new words, always start from the `Template - Staging/[[New Word Template]].md`.
-   Prefer placing detailed notes in the `New Words/` directory.
-   Use the root directory for broad category notes or terms that haven't been fully expanded into the template format yet.
-   Maintain the Vietnamese explanations to stay consistent with existing notes.
-   Example sentences MUST closely match the source material (Mimi Kara Oboeru N3).
