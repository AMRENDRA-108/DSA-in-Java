<h2><a href="https://www.geeksforgeeks.org/problems/check-if-the-door-is-open-or-closed2013/1?page=1&company=TCS">Status of Doors after n Toggles</a></h2><h3>Difficulty Level : Difficulty: Basic</h3><hr><div class="problems_problem_content__Xm_eO" style="--text-color: var(--problem-text-color);"><p><span style="font-size: 14pt;">There are </span><strong style="font-size: 14pt;">n&nbsp;</strong><span style="font-size: 14pt;">closed doors and <strong>n</strong> people. </span></p>
<ol>
<li><span style="font-size: 14pt;">All doors are initially closed</span></li>
<li><span style="font-size: 14pt;">Person i toggles the status of every ith door, i.e., doors whose number is a multiple of i.&nbsp;</span></li>
<li><span style="font-size: 14pt;">Every person does the above step (step 2)&nbsp; from person 1 to n.</span></li>
</ol>
<p><span style="font-size: 14pt;">Find the final status of all doors after all persons have acted once.</span></p>
<p><span style="font-size: 18px;"><strong>Examples:</strong></span></p>
<pre><span style="font-size: 18px;"><strong style="font-size: 18px;">Input:</strong> </span><span style="font-size: 18px;"><span style="font-size: 18px;">n </span><strong style="font-size: 18px;">= </strong><span style="font-size: 18px;">3
</span><strong><span style="font-size: 18px;">Output:</span> </strong></span><span style="font-size: 18px;">1 0 0 </span>
<span style="font-size: 18px;"><strong><span style="font-size: 18px;">Explanation:</span> </strong></span><span style="font-size: 18px;">Initial status of rooms (0 0 0). Person 1 changes to (1 1 1). Person 2 changes to (1 0 1). Person 3 changes to (1 0 0).</span></pre>
<pre><span style="font-size: 18px;"><strong style="font-size: 18px;">Input: </strong><span style="font-size: 14pt;">n</span></span><span style="font-size: 18px;"><strong style="font-size: 18px;"><span style="font-size: 14pt;"> </span>= </strong><span style="font-size: 18px;">2
</span><strong><span style="font-size: 18px;">Output:</span> </strong></span><span style="font-size: 18px;">1 0</span>
<span style="font-size: 18px;"><strong><span style="font-size: 18px;">Explanation:</span> </strong></span><span style="font-size: 18px;">Initial status of rooms (0 0). Person 1 changes to (1, 1) and person 2 changes to (1, 0)</span></pre>
<p><span style="font-size: 18px;"><strong>Constraints:</strong></span><br><span style="font-size: 18px;">1 ≤ n ≤ 10<sup>4</sup></span></p></div><p><span style=font-size:18px><strong>Company Tags : </strong><br><code>TCS</code>&nbsp;<br><p><span style=font-size:18px><strong>Topic Tags : </strong><br><code>Mathematical</code>&nbsp;