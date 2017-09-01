## Spark RDD Assignment
---
**`Ques 1: Create​ ​ an​ ​ RDD​ ​ (Resilient​ ​ Distributed​ ​ Dataset)​ ​ named​ ​ pagecounts​​ ​ from​ ​ the​ ​ input​ ​ file.`**
> Done that, created RDD 'pagecounts'

**`Ques 2: Get​ ​ the​ ​ 10​ ​ records​ ​ from​ ​ the​ ​ data​ ​ and​ ​ write​ ​ the​ ​ data​ ​ which​ ​ is​ ​ getting​ ​ printed/displayed.`**
> Written the result to output.txt in src/main/resources

**`Ques 3: How​ ​ many​ ​ records​ ​ in​ ​ total​ ​ are​ ​ in​ ​ the​ ​ given​ ​ data​ ​ set​ ​ ?`**
> Total number of records: 7598006

**`Ques 4: The​ ​ first​ ​ field​ ​ is​ ​ the​ ​ “project​ ​ code”​ ​ and​ ​ contains​ ​ information​ ​ about​ ​ the​ ​ language​ ​ of​ ​ the
pages.​ ​ For​ ​ example,​ ​ the​ ​ project​ ​ code​ ​ “en”​ ​ indicates​ ​ an​ ​ English​ ​ page.​ ​ Derive​ ​ an​ ​ RDD​ ​ containing
only​ ​ English​ ​ pages​ ​ from​ ​ pagecounts​ .`**
> Done that, created RDD 'englishPages'

**`Ques 5: How​ ​ many​ ​ records​ ​ are​ ​ there​ ​ for​ ​ English​ ​ pages?`**
> Count of English Pages: 2278417

**`Ques 6: ​ Find​ ​ the​ ​ pages​ ​ that​ ​ were​ ​ requested​ ​ more​ ​ than​ ​ 200,000​ ​ times​ ​ in​ ​ total.`**
> Pages requested more than 200000 times are: List((de,1040678), (ru,477729), (Special:HideBanners,1362459), (pt,320239), (Main_Page,450191), (ja,335982), (en,4925925), (it,746508), (pl,223976), (fr,783966), (es,1083799))
